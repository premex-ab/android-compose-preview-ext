package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AND device specifications for Android Compose previews.
 *
 * This extension provides AND device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.And.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.And: Any
  get() = object {
      /** AND HS8916QC */
      val HS8916QC = "spec:width=720,height=1280,unit=px,dpi=320"

  }
