package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IRA device specifications for Android Compose previews.
 *
 * This extension provides IRA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IRA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IRA: Any
  get() = object {
      /** DeviceSpec(manufacturer=IRA, code=IRA801, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRA, code=IRA801, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val IRA801 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRA, code=IRA_DUO_PLUS, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRA, code=IRA_DUO_PLUS, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val IRA_DUO_PLUS = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRA, code=IRA_W801, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRA, code=IRA_W801, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IRA_W801 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRA, code=T1021, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRA, code=T1021, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val T1021 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IRA, code=T1030A, width=1200, height=2000, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRA, code=T1030A, width=1200,
      height=2000, dpi=340, isGoogleDevice=false).code */
      val T1030A = "spec:width=1200,height=2000,unit=px,dpi=340"

      /** DeviceSpec(manufacturer=IRA, code=T803, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRA, code=T803, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T803 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRA, code=T808, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRA, code=T808, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val T808 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
