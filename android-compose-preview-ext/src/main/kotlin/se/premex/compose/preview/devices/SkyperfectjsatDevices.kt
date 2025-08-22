package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SKYPerfectJSAT device specifications for Android Compose previews.
 *
 * This extension provides SKYPerfectJSAT device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Skyperfectjsat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Skyperfectjsat: Any
  get() = object {
      /** SKYPerfectJSAT SKP-IS401 */
      val SKP_IS401 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
