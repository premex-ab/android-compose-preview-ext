package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * strawberry device specifications for Android Compose previews.
 *
 * This extension provides strawberry device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Strawberry.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Strawberry: Any
  get() = object {
      /** strawberry SX */
      val SX = "spec:width=720,height=1520,unit=px,dpi=320"

  }
