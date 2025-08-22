package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CTRONIQ device specifications for Android Compose previews.
 *
 * This extension provides CTRONIQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CTRONIQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CTRONIQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=CTRONIQ, code=CTRONIQ-SNOOK-X10, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CTRONIQ, code=CTRONIQ-SNOOK-X10,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val CTRONIQ_SNOOK_X10 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CTRONIQ, code=CTRONIQ-SNOOK-X10L, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CTRONIQ, code=CTRONIQ-SNOOK-X10L,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val CTRONIQ_SNOOK_X10L = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CTRONIQ, code=4G_TABLET, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CTRONIQ, code=4G_TABLET, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val _4G_TABLET = "spec:width=800,height=1280,unit=px,dpi=213"

  }
