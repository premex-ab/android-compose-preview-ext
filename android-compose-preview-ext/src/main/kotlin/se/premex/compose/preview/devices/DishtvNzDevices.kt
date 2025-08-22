package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DishTV-NZ device specifications for Android Compose previews.
 *
 * This extension provides DishTV-NZ device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DishtvNz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DishtvNz: Any
  get() = object {
      /** DishTV-NZ HiCast */
      val HICAST = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
