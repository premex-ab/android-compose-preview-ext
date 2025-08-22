package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * IMPECCA device specifications for Android Compose previews.
 *
 * This extension provides IMPECCA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Impecca.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Impecca: Any
  get() = object {
      /** IMPECCA gangbyeon */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
