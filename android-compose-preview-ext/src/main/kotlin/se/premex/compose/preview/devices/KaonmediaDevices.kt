package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KaonMedia device specifications for Android Compose previews.
 *
 * This extension provides KaonMedia device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kaonmedia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kaonmedia: Any
  get() = object {
      /** KaonMedia BKO-AT800 */
      val BKO_AT800 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KaonMedia IC1110 */
      val IC1110 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KaonMedia KM_SH368AT */
      val KM_SH368AT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KaonMedia KSTB2019 */
      val KSTB2019 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KaonMedia KSTB2020 */
      val KSTB2020 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KaonMedia KSTB2100 */
      val KSTB2100 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KaonMedia KSTB4252 */
      val KSTB4252 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KaonMedia KSTB5043 */
      val KSTB5043 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KaonMedia KSTB6020 */
      val KSTB6020 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KaonMedia KSTB6043 */
      val KSTB6043 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KaonMedia KSTB6077 */
      val KSTB6077 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KaonMedia KSTB6130 */
      val KSTB6130 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KaonMedia SFCSTB2LITE */
      val SFCSTB2LITE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
