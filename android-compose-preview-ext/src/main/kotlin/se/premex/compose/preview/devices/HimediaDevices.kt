package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HiMedia device specifications for Android Compose previews.
 *
 * This extension provides HiMedia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Himedia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Himedia: Any
  get() = object {
      /** HiMedia HiBox */
      val HIBOX = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
