package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ixtech device specifications for Android Compose previews.
 *
 * This extension provides ixtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ixtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ixtech: Any
  get() = object {
      /** ixtech IX1013 */
      val IX1013 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** ixtech IX701 */
      val IX701 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
