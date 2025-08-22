package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAJESTIC device specifications for Android Compose previews.
 *
 * This extension provides MAJESTIC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAJESTIC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAJESTIC: Any
  get() = object {
      /** DeviceSpec(manufacturer=MAJESTIC, code=JACK, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=JACK, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val JACK = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MAJESTIC, code=JOE, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=JOE, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val JOE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MAJESTIC, code=lasalle, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=lasalle, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_611_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_611_3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB_611_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_711_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_711_4G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_711_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB-714, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB-714, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB_714 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_720_PLUS, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_720_PLUS,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB_720_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB-746, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB-746, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB_746 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_811_4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_811_4G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB_811_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_812_4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_812_4G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB_812_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_814, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_814, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_814 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_847_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_847_3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB_847_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_911_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_911_3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB_911_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_912_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_912_4G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_912_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_912_PRO_4G, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_912_PRO_4G,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val TAB_912_PRO_4G = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_914, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_914, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB_914 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_915_4G, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_915_4G,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val TAB_915_4G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_916_4G, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_916_4G,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val TAB_916_4G = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_918_PRO_4G, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_918_PRO_4G,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val TAB_918_PRO_4G = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=MAJESTIC, code=TAB_920_PLUS_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAJESTIC, code=TAB_920_PLUS_4G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_920_PLUS_4G = "spec:width=800,height=1280,unit=px,dpi=213"

  }
