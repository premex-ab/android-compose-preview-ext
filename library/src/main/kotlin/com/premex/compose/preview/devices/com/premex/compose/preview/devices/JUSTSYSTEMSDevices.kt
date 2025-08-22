package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JUSTSYSTEMS device specifications for Android Compose previews.
 *
 * This extension provides JUSTSYSTEMS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JUSTSYSTEMS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JUSTSYSTEMS: Any
  get() = object {
      /** DeviceSpec(manufacturer=JUSTSYSTEMS, code=SZJ201, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUSTSYSTEMS, code=SZJ201,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SZJ201 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JUSTSYSTEMS, code=SZJ202, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUSTSYSTEMS, code=SZJ202,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SZJ202 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JUSTSYSTEMS, code=SZJ203, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JUSTSYSTEMS, code=SZJ203,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val SZJ203 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
