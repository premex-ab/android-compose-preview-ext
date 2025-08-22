package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DGO device specifications for Android Compose previews.
 *
 * This extension provides DGO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dgo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dgo: Any
  get() = object {
      /** DGO HP46D */
      val HP46D = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
