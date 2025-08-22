package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Swipe device specifications for Android Compose previews.
 *
 * This extension provides Swipe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Swipe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Swipe: Any
  get() = object {
      /** DeviceSpec(manufacturer=Swipe, code=Slate2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Swipe, code=Slate2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SLATE2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Swipe, code=Strike, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Swipe, code=Strike, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val STRIKE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Swipe, code=Swipe_Slate_3, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Swipe, code=Swipe_Slate_3,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SWIPE_SLATE_3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Swipe, code=Swipe_Slate_3_WiFi, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Swipe, code=Swipe_Slate_3_WiFi,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SWIPE_SLATE_3_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Swipe, code=Swipe_Strike8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Swipe, code=Swipe_Strike8,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SWIPE_STRIKE8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Swipe, code=Swipe_X1, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Swipe, code=Swipe_X1, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SWIPE_X1 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
