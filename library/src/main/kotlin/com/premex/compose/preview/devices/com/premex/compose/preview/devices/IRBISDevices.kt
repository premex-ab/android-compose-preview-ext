package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IRBIS device specifications for Android Compose previews.
 *
 * This extension provides IRBIS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IRBIS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IRBIS: Any
  get() = object {
      /** DeviceSpec(manufacturer=IRBIS, code=SP514, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=SP514, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SP514 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IRBIS, code=SP542, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=SP542, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SP542 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IRBIS, code=SP554, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=SP554, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SP554 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ151, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ151, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TZ151 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ165, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ165, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TZ165 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ175, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ175, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TZ175 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ179, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ179, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TZ179 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ195, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ195, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TZ195 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ197, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ197, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TZ197 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ198, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ198, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TZ198 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ199, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ199, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TZ199 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ200, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ200, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TZ200 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ711, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ711, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TZ711 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ718, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ718, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TZ718 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ719, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ719, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TZ719 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ720, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ720, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TZ720 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ722, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ722, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TZ722 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ725, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ725, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TZ725 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ728, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ728, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TZ728 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ737, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ737, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TZ737 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ754, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ754, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TZ754 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ772, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ772, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TZ772 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ773, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ773, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TZ773 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ777, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ777, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TZ777 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ797, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ797, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TZ797 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ832, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ832, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TZ832 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ855, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ855, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TZ855 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ856, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ856, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TZ856 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ897, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ897, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TZ897 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ960, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ960, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TZ960 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ963, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ963, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TZ963 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ965, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ965, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TZ965 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ968, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ968, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TZ968 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=IRBIS, code=TZ969, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IRBIS, code=TZ969, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TZ969 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
