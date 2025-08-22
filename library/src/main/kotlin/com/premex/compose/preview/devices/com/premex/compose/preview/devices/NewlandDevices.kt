package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Newland device specifications for Android Compose previews.
 *
 * This extension provides Newland device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Newland.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Newland: Any
  get() = object {
      /** DeviceSpec(manufacturer=Newland, code=NLS-MT6550-AM, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-MT6550-AM,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val NLS_MT6550_AM = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Newland, code=NLS-MT6552-EEA, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-MT6552-EEA,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val NLS_MT6552_EEA = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Newland, code=NLS-MT6552-GL, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-MT6552-GL,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val NLS_MT6552_GL = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Newland, code=NLS-MT6555-GL, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-MT6555-GL,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val NLS_MT6555_GL = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Newland, code=NLS-MT6755-GL, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-MT6755-GL,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val NLS_MT6755_GL = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Newland, code=NLS-MT9052-GL, width=720, height=1280, dpi=294,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-MT9052-GL,
      width=720, height=1280, dpi=294, isGoogleDevice=false).code */
      val NLS_MT9052_GL = "spec:width=720,height=1280,unit=px,dpi=294"

      /** DeviceSpec(manufacturer=Newland, code=NLS-MT9055-GL, width=720, height=1280, dpi=294,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-MT9055-GL,
      width=720, height=1280, dpi=294, isGoogleDevice=false).code */
      val NLS_MT9055_GL = "spec:width=720,height=1280,unit=px,dpi=294"

      /** DeviceSpec(manufacturer=Newland, code=NLS-MT90-GL, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-MT90-GL,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val NLS_MT90_GL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Newland, code=NLS-MT93, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-MT93, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val NLS_MT93 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Newland, code=NLS-MT95, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-MT95, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val NLS_MT95 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Newland, code=NLS-N7, width=480, height=800, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-N7, width=480,
      height=800, dpi=160, isGoogleDevice=false).code */
      val NLS_N7 = "spec:width=480,height=800,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Newland, code=NLS-N7-GL, width=480, height=800, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-N7-GL, width=480,
      height=800, dpi=213, isGoogleDevice=false).code */
      val NLS_N7_GL = "spec:width=480,height=800,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Newland, code=NLS-NFT10-GL, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-NFT10-GL,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val NLS_NFT10_GL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Newland, code=NLS-NQuire, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newland, code=NLS-NQuire,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val NLS_NQUIRE = "spec:width=800,height=1280,unit=px,dpi=160"

  }
