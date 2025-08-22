package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZOJI device specifications for Android Compose previews.
 *
 * This extension provides ZOJI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZOJI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZOJI: Any
  get() = object {
      /** ZOJI Z33 */
      val Z33 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** ZOJI Z8 */
      val Z8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ZOJI Z9 */
      val Z9 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
