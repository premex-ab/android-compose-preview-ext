package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZAMOLXE device specifications for Android Compose previews.
 *
 * This extension provides ZAMOLXE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZAMOLXE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZAMOLXE: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZAMOLXE, code=ZXT-10FL323G-PRO, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZAMOLXE, code=ZXT-10FL323G-PRO,
      width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val ZXT_10FL323G_PRO = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZAMOLXE, code=ZXT-10HL323S, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZAMOLXE, code=ZXT-10HL323S,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ZXT_10HL323S = "spec:width=800,height=1280,unit=px,dpi=213"

  }
