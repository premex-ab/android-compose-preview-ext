package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SoyMomo device specifications for Android Compose previews.
 *
 * This extension provides SoyMomo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SoyMomo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SoyMomo: Any
  get() = object {
      /** DeviceSpec(manufacturer=SoyMomo, code=Pro_V1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SoyMomo, code=Pro_V1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PRO_V1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SoyMomo, code=SoyMomo_Pro_EU_V1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SoyMomo, code=SoyMomo_Pro_EU_V1,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SOYMOMO_PRO_EU_V1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SoyMomo, code=SoyMomo_Pro_V2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SoyMomo, code=SoyMomo_Pro_V2,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SOYMOMO_PRO_V2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SoyMomo, code=SoyMomo_Pro_V2_24, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SoyMomo, code=SoyMomo_Pro_V2_24,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SOYMOMO_PRO_V2_24 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
