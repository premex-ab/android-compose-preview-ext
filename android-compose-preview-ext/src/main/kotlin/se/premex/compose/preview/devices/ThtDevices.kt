package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * THT device specifications for Android Compose previews.
 *
 * This extension provides THT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tht.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tht: Any
  get() = object {
      /** THT SEI700THT */
      val SEI700THT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
