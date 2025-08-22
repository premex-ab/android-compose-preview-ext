package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DORA device specifications for Android Compose previews.
 *
 * This extension provides DORA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dora.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dora: Any
  get() = object {
      /** DORA longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DORA R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DORA R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DORA redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
