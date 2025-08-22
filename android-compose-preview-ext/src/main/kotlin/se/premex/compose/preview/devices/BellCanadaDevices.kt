package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Bell_Canada device specifications for Android Compose previews.
 *
 * This extension provides Bell_Canada device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BellCanada.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BellCanada: Any
  get() = object {
      /** Bell_Canada vip7802_bell */
      val VIP7802_BELL = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
