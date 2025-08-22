package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Algar device specifications for Android Compose previews.
 *
 * This extension provides Algar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Algar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Algar: Any
  get() = object {
      /** Algar GIU6770 */
      val GIU6770 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
