package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NAVITEL device specifications for Android Compose previews.
 *
 * This extension provides NAVITEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NAVITEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NAVITEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=NAVITEL, code=NAVITEL_T700_3G_NAVI, width=600, height=1024,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAVITEL,
      code=NAVITEL_T700_3G_NAVI, width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val NAVITEL_T700_3G_NAVI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NAVITEL, code=NAVITEL_T757LTE, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAVITEL, code=NAVITEL_T757LTE,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val NAVITEL_T757LTE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NAVITEL, code=NAVITEL_T797_4G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAVITEL, code=NAVITEL_T797_4G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val NAVITEL_T797_4G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NAVITEL, code=T500_3G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAVITEL, code=T500_3G, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val T500_3G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NAVITEL, code=T505PRO, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAVITEL, code=T505PRO, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T505PRO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NAVITEL, code=T707_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAVITEL, code=T707_3G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T707_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NAVITEL, code=T737PRO, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAVITEL, code=T737PRO, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T737PRO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NAVITEL, code=T787-4G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAVITEL, code=T787-4G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T787_4G = "spec:width=600,height=1024,unit=px,dpi=160"

  }
