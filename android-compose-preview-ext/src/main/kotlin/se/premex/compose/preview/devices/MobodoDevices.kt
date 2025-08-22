package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MOBODO device specifications for Android Compose previews.
 *
 * This extension provides MOBODO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobodo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobodo: Any
  get() = object {
      /** MOBODO MOBOK2 */
      val MOBOK2 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
