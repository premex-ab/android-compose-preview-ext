package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GeneralSupreme device specifications for Android Compose previews.
 *
 * This extension provides GeneralSupreme device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Generalsupreme.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Generalsupreme: Any
  get() = object {
      /** GeneralSupreme longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
