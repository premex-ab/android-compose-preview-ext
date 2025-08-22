package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Acepad device specifications for Android Compose previews.
 *
 * This extension provides Acepad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Acepad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Acepad: Any
  get() = object {
      /** Acepad A130 */
      val A130 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Acepad A131 */
      val A131 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** Acepad A131_14 */
      val A131_14 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Acepad A140 */
      val A140 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Acepad A145 */
      val A145 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Acepad A150 */
      val A150 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Acepad A150_14 */
      val A150_14 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** Acepad A170 */
      val A170 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Acepad A171_14 */
      val A171_14 = "spec:width=1200,height=2000,unit=px,dpi=213"

      /** Acepad Acepad_HIGH_EEA */
      val ACEPAD_HIGH_EEA = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** Acepad AX1 */
      val AX1 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
