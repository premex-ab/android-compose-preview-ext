package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QTab device specifications for Android Compose previews.
 *
 * This extension provides QTab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QTab: Any
  get() = object {
      /** DeviceSpec(manufacturer=QTab, code=QTab_V100, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QTab, code=QTab_V100, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val QTAB_V100 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=QTab, code=QTab_V500, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QTab, code=QTab_V500, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val QTAB_V500 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=QTab, code=V5, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QTab, code=V5, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val V5 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=QTab, code=V5_Plus, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QTab, code=V5_Plus, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val V5_PLUS = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=QTab, code=V6_Metal, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QTab, code=V6_Metal, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val V6_METAL = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=QTab, code=V7_LTE, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QTab, code=V7_LTE, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val V7_LTE = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=QTab, code=V7_Metal, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QTab, code=V7_Metal, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val V7_METAL = "spec:width=600,height=1024,unit=px,dpi=213"

  }
