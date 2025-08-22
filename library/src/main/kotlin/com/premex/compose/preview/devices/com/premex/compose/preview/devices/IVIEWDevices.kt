package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IVIEW device specifications for Android Compose previews.
 *
 * This extension provides IVIEW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IVIEW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IVIEW: Any
  get() = object {
      /** DeviceSpec(manufacturer=IVIEW, code=IVIEW_1170TPC, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IVIEW, code=IVIEW_1170TPC,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val IVIEW_1170TPC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IVIEW, code=1016TPC, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IVIEW, code=1016TPC, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _1016TPC = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IVIEW, code=816TPC, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IVIEW, code=816TPC, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val _816TPC = "spec:width=800,height=1280,unit=px,dpi=213"

  }
