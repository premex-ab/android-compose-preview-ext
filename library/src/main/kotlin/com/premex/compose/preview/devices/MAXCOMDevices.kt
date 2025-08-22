package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAXCOM device specifications for Android Compose previews.
 *
 * This extension provides MAXCOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAXCOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAXCOM: Any
  get() = object {
      /** MAXCOM MS457 */
      val MS457 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MAXCOM MS457PLUS */
      val MS457PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** MAXCOM MS571 */
      val MS571 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** MAXCOM MS571_plus */
      val MS571_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** MAXCOM MS572 */
      val MS572 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
