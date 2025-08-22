package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * eroc device specifications for Android Compose previews.
 *
 * This extension provides eroc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Eroc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Eroc: Any
  get() = object {
      /** eroc BOS */
      val BOS = "spec:width=720,height=1280,unit=px,dpi=213"

  }
