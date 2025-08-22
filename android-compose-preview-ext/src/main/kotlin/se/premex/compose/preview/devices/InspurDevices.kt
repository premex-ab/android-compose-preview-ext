package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Inspur device specifications for Android Compose previews.
 *
 * This extension provides Inspur device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Inspur.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Inspur: Any
  get() = object {
      /** Inspur S905 */
      val S905 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
