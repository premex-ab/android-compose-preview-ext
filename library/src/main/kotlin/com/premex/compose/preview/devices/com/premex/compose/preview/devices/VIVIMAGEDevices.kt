package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VIVIMAGE device specifications for Android Compose previews.
 *
 * This extension provides VIVIMAGE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VIVIMAGE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VIVIMAGE: Any
  get() = object {
      /** DeviceSpec(manufacturer=VIVIMAGE, code=E10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVIMAGE, code=E10, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val E10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VIVIMAGE, code=E11, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVIMAGE, code=E11, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val E11 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VIVIMAGE, code=E8, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVIMAGE, code=E8, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val E8 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VIVIMAGE, code=VIVIMAGE_A10, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVIMAGE, code=VIVIMAGE_A10,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val VIVIMAGE_A10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=VIVIMAGE, code=VIVIMAGE_A10_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVIMAGE, code=VIVIMAGE_A10_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val VIVIMAGE_A10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
