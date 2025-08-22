package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AMSTRAD device specifications for Android Compose previews.
 *
 * This extension provides AMSTRAD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AMSTRAD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AMSTRAD: Any
  get() = object {
      /** AMSTRAD R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AMSTRAD R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AMSTRAD R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AMSTRAD R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
