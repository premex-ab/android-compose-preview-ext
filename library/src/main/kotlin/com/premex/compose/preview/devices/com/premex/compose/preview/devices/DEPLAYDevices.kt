package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DEPLAY device specifications for Android Compose previews.
 *
 * This extension provides DEPLAY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DEPLAY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DEPLAY: Any
  get() = object {
      /** DeviceSpec(manufacturer=DEPLAY, code=BS101_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEPLAY, code=BS101_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val BS101_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEPLAY, code=BS703_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEPLAY, code=BS703_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val BS703_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEPLAY, code=BS801_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEPLAY, code=BS801_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BS801_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEPLAY, code=E101GCM, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEPLAY, code=E101GCM, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val E101GCM = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=DEPLAY, code=E108GCM, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEPLAY, code=E108GCM, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val E108GCM = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=DEPLAY, code=LITE4_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEPLAY, code=LITE4_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val LITE4_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEPLAY, code=PRO4, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEPLAY, code=PRO4, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PRO4 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
