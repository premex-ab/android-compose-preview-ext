package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MoshiMore device specifications for Android Compose previews.
 *
 * This extension provides MoshiMore device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Moshimore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Moshimore: Any
  get() = object {
      /** MoshiMore RG1 */
      val RG1 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
