package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STREAM-SYSTEM device specifications for Android Compose previews.
 *
 * This extension provides STREAM-SYSTEM device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.StreamSystem.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.StreamSystem: Any
  get() = object {
      /** STREAM-SYSTEM R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** STREAM-SYSTEM R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** STREAM-SYSTEM R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** STREAM-SYSTEM R3_GTV */
      val R3_GTV = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** STREAM-SYSTEM R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** STREAM-SYSTEM R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** STREAM-SYSTEM vileparle */
      val VILEPARLE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
