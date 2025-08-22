package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MYSTIC device specifications for Android Compose previews.
 *
 * This extension provides MYSTIC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MYSTIC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MYSTIC: Any
  get() = object {
      /** MYSTIC R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MYSTIC R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MYSTIC R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MYSTIC R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MYSTIC R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MYSTIC R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
