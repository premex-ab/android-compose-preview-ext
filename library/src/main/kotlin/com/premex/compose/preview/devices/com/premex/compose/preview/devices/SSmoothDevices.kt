package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SSmooth device specifications for Android Compose previews.
 *
 * This extension provides SSmooth device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SSmooth.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SSmooth: Any
  get() = object {
      /** DeviceSpec(manufacturer=SSmooth, code=NOVA_6_5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=NOVA_6_5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NOVA_6_5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SSmooth, code=Smooth5_5_Lite, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=Smooth5_5_Lite,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val SMOOTH5_5_LITE = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SSmooth, code=Smooth6_1, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=Smooth6_1, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val SMOOTH6_1 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SSmooth, code=Smooth6_26_Lite, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=Smooth6_26_Lite,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val SMOOTH6_26_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SSmooth, code=Smooth6_26_Max, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=Smooth6_26_Max,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val SMOOTH6_26_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SSmooth, code=Smooth6_26_Pro, width=720, height=1520, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=Smooth6_26_Pro,
      width=720, height=1520, dpi=300, isGoogleDevice=false).code */
      val SMOOTH6_26_PRO = "spec:width=720,height=1520,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=SSmooth, code=Smooth6_5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=Smooth6_5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SMOOTH6_5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SSmooth, code=Smooth_5_0_2022, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=Smooth_5_0_2022,
      width=480, height=854, dpi=213, isGoogleDevice=false).code */
      val SMOOTH_5_0_2022 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SSmooth, code=Smooth_5_5_MAX, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=Smooth_5_5_MAX,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val SMOOTH_5_5_MAX = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SSmooth, code=Smooth_6_0, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=Smooth_6_0,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val SMOOTH_6_0 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SSmooth, code=Smooth_8GT, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=Smooth_8GT,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SMOOTH_8GT = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SSmooth, code=Smooth_Note_6_8, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=Smooth_Note_6_8,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val SMOOTH_NOTE_6_8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SSmooth, code=SMV15523216, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=SMV15523216,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val SMV15523216 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SSmooth, code=SSmooth5_5, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=SSmooth5_5,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val SSMOOTH5_5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SSmooth, code=SSmooth_5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=SSmooth_5, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SSMOOTH_5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SSmooth, code=SSmooth_5_HD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=SSmooth_5_HD,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val SSMOOTH_5_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SSmooth, code=Vision, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=Vision, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VISION = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SSmooth, code=Vision_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SSmooth, code=Vision_Plus,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val VISION_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

  }
