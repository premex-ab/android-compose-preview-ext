package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * clovertek device specifications for Android Compose previews.
 *
 * This extension provides clovertek device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Clovertek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Clovertek: Any
  get() = object {
      /** clovertek FTab */
      val FTAB = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
