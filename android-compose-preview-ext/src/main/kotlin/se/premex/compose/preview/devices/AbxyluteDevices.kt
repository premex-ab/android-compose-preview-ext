package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * abxylute device specifications for Android Compose previews.
 *
 * This extension provides abxylute device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Abxylute.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Abxylute: Any
  get() = object {
      /** abxylute abxylute_one */
      val ABXYLUTE_ONE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
