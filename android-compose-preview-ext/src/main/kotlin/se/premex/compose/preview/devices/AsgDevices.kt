package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ASG device specifications for Android Compose previews.
 *
 * This extension provides ASG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Asg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Asg: Any
  get() = object {
      /** ASG SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
