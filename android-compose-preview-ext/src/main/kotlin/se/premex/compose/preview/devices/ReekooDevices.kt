package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Reekoo device specifications for Android Compose previews.
 *
 * This extension provides Reekoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Reekoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Reekoo: Any
  get() = object {
      /** Reekoo AllCall_60 */
      val ALLCALL_60 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
