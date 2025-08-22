package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SocialPhone_700 device specifications for Android Compose previews.
 *
 * This extension provides SocialPhone_700 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Socialphone700.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Socialphone700: Any
  get() = object {
      /** SocialPhone_700 Tablet_DL_3420 */
      val TABLET_DL_3420 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
