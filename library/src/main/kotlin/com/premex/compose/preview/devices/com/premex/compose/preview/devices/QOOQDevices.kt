package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QOOQ device specifications for Android Compose previews.
 *
 * This extension provides QOOQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QOOQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QOOQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=QOOQ, code=QOOQ, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QOOQ, code=QOOQ, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val QOOQ = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=QOOQ, code=QOOQ-V50, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QOOQ, code=QOOQ-V50, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val QOOQ_V50 = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
