package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AIWA device specifications for Android Compose previews.
 *
 * This extension provides AIWA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AIWA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AIWA: Any
  get() = object {
      /** DeviceSpec(manufacturer=AIWA, code=AIWA_A81, width=800, height=1280, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=AIWA_A81, width=800,
      height=1280, dpi=300, isGoogleDevice=false).code */
      val AIWA_A81 = "spec:width=800,height=1280,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=AIWA, code=AW790, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=AW790, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AW790 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AIWA, code=AWM501, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=AWM501, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val AWM501 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AIWA, code=AWM539, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=AWM539, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val AWM539 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AIWA, code=AWPP101AW, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=AWPP101AW, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AWPP101AW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AIWA, code=AWT10H, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=AWT10H, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AWT10H = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AIWA, code=AW-P, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=AW-P, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AW_P = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AIWA, code=AW_TAB10_14, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=AW_TAB10_14, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AW_TAB10_14 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AIWA, code=hongkong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=hongkong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AIWA, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=ikebukuro, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AIWA, code=lavender, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=lavender, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AIWA, code=longshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=longshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AIWA, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=mountbaker, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AIWA, code=R3, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=R3, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AIWA, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AIWA, code=redwood, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=redwood, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AIWA, code=samseong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=samseong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AIWA, code=shinagawa, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=shinagawa, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AIWA, code=sindorim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=sindorim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AIWA, code=stanford, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=stanford, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AIWA, code=SW6H, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=SW6H, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AIWA, code=TA07-2GB, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=TA07-2GB, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TA07_2GB = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AIWA, code=TA10-SO10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=TA10-SO10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TA10_SO10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AIWA, code=TABLETAWTH801, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=TABLETAWTH801,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TABLETAWTH801 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AIWA, code=TAB_1003G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=TAB_1003G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_1003G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AIWA, code=TAB-1100, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=TAB-1100, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val TAB_1100 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=AIWA, code=TAB-1102, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=TAB-1102, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB_1102 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AIWA, code=TAB-1103, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=TAB-1103, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB_1103 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AIWA, code=TA-07-232, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=TA-07-232, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TA_07_232 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AIWA, code=TA-10-232, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=TA-10-232, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TA_10_232 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AIWA, code=zhongshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AIWA, code=zhongshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
