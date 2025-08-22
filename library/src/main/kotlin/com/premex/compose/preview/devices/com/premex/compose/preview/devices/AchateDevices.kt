package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Achate device specifications for Android Compose previews.
 *
 * This extension provides Achate device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Achate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Achate: Any
  get() = object {
      /** DeviceSpec(manufacturer=Achate, code=KidsTab1_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Achate, code=KidsTab1_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val KIDSTAB1_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Achate, code=KidsTab3_EEA, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Achate, code=KidsTab3_EEA,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val KIDSTAB3_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Achate, code=Kids_Tab_2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Achate, code=Kids_Tab_2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KIDS_TAB_2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
