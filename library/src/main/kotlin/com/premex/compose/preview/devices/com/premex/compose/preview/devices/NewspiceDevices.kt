package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * newspice device specifications for Android Compose previews.
 *
 * This extension provides newspice device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Newspice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Newspice: Any
  get() = object {
      /** DeviceSpec(manufacturer=newspice, code=Spice_F301, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=newspice, code=Spice_F301,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val SPICE_F301 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=newspice, code=Spice_F302, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=newspice, code=Spice_F302,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val SPICE_F302 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=newspice, code=Spice-F305, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=newspice, code=Spice-F305,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val SPICE_F305 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=newspice, code=Spice-F311, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=newspice, code=Spice-F311,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val SPICE_F311 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=newspice, code=Spice_K601, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=newspice, code=Spice_K601,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val SPICE_K601 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=newspice, code=Spice_V801, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=newspice, code=Spice_V801,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val SPICE_V801 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
