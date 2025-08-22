package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * bell device specifications for Android Compose previews.
 *
 * This extension provides bell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bell: Any
  get() = object {
      /** bell sti6130d324 */
      val STI6130D324 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
