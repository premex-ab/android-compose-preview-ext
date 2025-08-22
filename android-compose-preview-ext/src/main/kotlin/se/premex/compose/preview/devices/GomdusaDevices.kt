package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GOMDUSA device specifications for Android Compose previews.
 *
 * This extension provides GOMDUSA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gomdusa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gomdusa: Any
  get() = object {
      /** GOMDUSA X23_TAB */
      val X23_TAB = "spec:width=800,height=1280,unit=px,dpi=240"

  }
