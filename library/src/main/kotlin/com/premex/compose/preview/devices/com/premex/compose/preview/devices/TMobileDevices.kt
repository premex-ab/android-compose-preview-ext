package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * T-Mobile device specifications for Android Compose previews.
 *
 * This extension provides T-Mobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=T-Mobile, code=Augusta, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=T-Mobile, code=Augusta, width=720,
      height=1640, dpi=280, isGoogleDevice=false).code */
      val AUGUSTA = "spec:width=720,height=1640,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=T-Mobile, code=Bethpage, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=T-Mobile, code=Bethpage, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val BETHPAGE = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=T-Mobile, code=CypressPoint, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=T-Mobile, code=CypressPoint,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val CYPRESSPOINT = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=T-Mobile, code=Newcastle, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=T-Mobile, code=Newcastle,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val NEWCASTLE = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=T-Mobile, code=Pinehurst, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=T-Mobile, code=Pinehurst,
      width=1080, height=2436, dpi=480, isGoogleDevice=false).code */
      val PINEHURST = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=T-Mobile, code=Porto, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=T-Mobile, code=Porto, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PORTO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=T-Mobile, code=Seattle_5G, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=T-Mobile, code=Seattle_5G,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val SEATTLE_5G = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=T-Mobile, code=SouthernDunes, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=T-Mobile, code=SouthernDunes,
      width=720, height=1640, dpi=280, isGoogleDevice=false).code */
      val SOUTHERNDUNES = "spec:width=720,height=1640,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=T-Mobile, code=Sprout, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=T-Mobile, code=Sprout, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val SPROUT = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=T-Mobile, code=Tokyo_Lite_4G, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=T-Mobile, code=Tokyo_Lite_4G,
      width=720, height=1520, dpi=280, isGoogleDevice=false).code */
      val TOKYO_LITE_4G = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=T-Mobile, code=TorreyPines, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=T-Mobile, code=TorreyPines,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val TORREYPINES = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=T-Mobile, code=T-Tab, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=T-Mobile, code=T-Tab, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

  }
