package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ARVAND device specifications for Android Compose previews.
 *
 * This extension provides ARVAND device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Arvand.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Arvand: Any
  get() = object {
      /** ARVAND M863TabH8 */
      val M863TABH8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
