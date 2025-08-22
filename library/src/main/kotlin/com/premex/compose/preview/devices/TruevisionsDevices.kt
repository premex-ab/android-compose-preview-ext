package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Truevisions device specifications for Android Compose previews.
 *
 * This extension provides Truevisions device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Truevisions.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Truevisions: Any
  get() = object {
      /** Truevisions HP42F */
      val HP42F = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Truevisions TrueHCH03 */
      val TRUEHCH03 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Truevisions TrueHPH07 */
      val TRUEHPH07 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
