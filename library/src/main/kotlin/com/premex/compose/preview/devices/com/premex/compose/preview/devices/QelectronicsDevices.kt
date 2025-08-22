package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Q-electronics device specifications for Android Compose previews.
 *
 * This extension provides Q-electronics device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qelectronics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qelectronics: Any
  get() = object {
      /** DeviceSpec(manufacturer=Q-electronics, code=QP-TAQC70, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Q-electronics, code=QP-TAQC70,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val QP_TAQC70 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Q-electronics, code=QP-TAQC80, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Q-electronics, code=QP-TAQC80,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val QP_TAQC80 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
