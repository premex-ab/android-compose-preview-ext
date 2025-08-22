package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMADL device specifications for Android Compose previews.
 *
 * This extension provides SMADL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMADL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMADL: Any
  get() = object {
      /** DeviceSpec(manufacturer=SMADL, code=Matri2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMADL, code=Matri2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MATRI2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SMADL, code=Safari, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMADL, code=Safari, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SAFARI = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SMADL, code=Safari_2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMADL, code=Safari_2, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SAFARI_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SMADL, code=Safari_2plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMADL, code=Safari_2plus,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val SAFARI_2PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SMADL, code=SMADL_Abay5_Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMADL, code=SMADL_Abay5_Plus,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val SMADL_ABAY5_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SMADL, code=SMADL_R35_FW, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMADL, code=SMADL_R35_FW,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val SMADL_R35_FW = "spec:width=480,height=854,unit=px,dpi=240"

  }
